import housing.HouseType;
import housing.Housing;
import services.HousingService;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Housing> houseList = new ArrayList<>();
        var housingService = new HousingService();

        houseList.add(new Housing(1, HouseType.HOUSE.houseType, BigDecimal.valueOf(300000), 120, 2, 1));
        houseList.add(new Housing(2, HouseType.HOUSE.houseType, BigDecimal.valueOf(300000), 150, 3, 1));
        houseList.add(new Housing(3, HouseType.HOUSE.houseType, BigDecimal.valueOf(700000), 210, 1, 1));

        houseList.add(new Housing(4, HouseType.VILLA.houseType, BigDecimal.valueOf(300000), 210, 5, 2));
        houseList.add(new Housing(5, HouseType.VILLA.houseType, BigDecimal.valueOf(400000), 190, 4, 1));
        houseList.add(new Housing(6, HouseType.VILLA.houseType, BigDecimal.valueOf(300000), 90, 2, 1));

        houseList.add(new Housing(7, HouseType.SUMMER_HOUSE.houseType, BigDecimal.valueOf(300000), 110, 1, 1));
        houseList.add(new Housing(8, HouseType.SUMMER_HOUSE.houseType, BigDecimal.valueOf(100000), 140, 2, 1));
        houseList.add(new Housing(9, HouseType.SUMMER_HOUSE.houseType, BigDecimal.valueOf(300000), 110, 2, 1));

        System.out.println("House List:");
        System.out.println(housingService.getHousingList(houseList, HouseType.HOUSE.houseType));

        System.out.println("Villa List:");
        System.out.println(housingService.getHousingList(houseList, HouseType.VILLA.houseType));

        System.out.println("Summer House List:");
        System.out.println(housingService.getHousingList(houseList, HouseType.SUMMER_HOUSE.houseType) + "\n");

        System.out.println("Total price of House: " + housingService.sumHouseTypePrice(houseList, HouseType.HOUSE.houseType));
        System.out.println("Total price of Villa: " + housingService.sumHouseTypePrice(houseList, HouseType.VILLA.houseType));
        System.out.println("Total price of Summer House: " + housingService.sumHouseTypePrice(houseList, HouseType.SUMMER_HOUSE.houseType));
        System.out.println("Total price of all Housing: " + housingService.sumHousePrice(houseList));

        System.out.println("Average square meter of Houses: " + housingService.avarageHousingSquare(houseList, HouseType.HOUSE.houseType));
        System.out.println("Average square meter of Villas: " + housingService.avarageHousingSquare(houseList, HouseType.VILLA.houseType));
        System.out.println("Average square meter of Summer Houses: " + housingService.avarageHousingSquare(houseList, HouseType.SUMMER_HOUSE.houseType));

        System.out.println("Average square meter of Housing: " + housingService.avarageHousingSquare(houseList));

        System.out.println("Filter Housing List: " + housingService.filterHousing(houseList, 2,1));
    }


}
