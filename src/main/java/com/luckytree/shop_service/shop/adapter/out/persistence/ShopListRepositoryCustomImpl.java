package com.luckytree.shop_service.shop.adapter.out.persistence;

import com.luckytree.shop_service.shop.domain.ShopList;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@RequiredArgsConstructor
public class ShopListRepositoryCustomImpl implements ShopListRepositoryCustom {

    private final ShopListRepository shopListRepository;

    @Override
    public List<ShopList> findAllByCoordinate(Double mapX, Double mapY) {
        int distance = 2; // km 단위

        // 북동쪽 좌표 구하기
        Location northEast = GeometryUtils.calculateByDirection(mapX, mapY, 2, CardinalDirection.NORTH_EAST);

        // 남서쪽 좌표 구하기
        Location southWest = GeometryUtils.calculateByDirection(mapX, mapY, 2, CardinalDirection.SOUTH_WEST);

        double x1 = northEast.getLongitude();
        double y1 = northEast.getLatitude();
        double x2 = southWest.getLongitude();
        double y2 = southWest.getLatitude();

        // native query 활용
        Query query = entityManager.createNativeQuery("" +
                "SELECT g.name \n" +
                "FROM GreenShop AS g \n" +
                "WHERE MBRContains(ST_LINESTRINGFROMTEXT(" + String.format("'LINESTRING(%f %f, %f %f)')", x1, y1, x2, y2) + ", g.location)"
        );
        query.setParameter(1, mapX);
        query.setParameter(2, mapY);
        query.setParameter(3, distance * 1000);

        List<?> result = query.getResultList();
        return shopListRepository.findAllByCoordinate(mapX, mapY);
    }
}