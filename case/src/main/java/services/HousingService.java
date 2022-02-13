package services;

import housing.Housing;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HousingService {

    public ArrayList<Housing> getHousingList(ArrayList<Housing> housings, String houseType) {

        ArrayList<Housing> housingList = new ArrayList<>();

        for (Housing h : housings) {
            if (houseType.equalsIgnoreCase(h.getHouseType())) {
                housingList.add(h);
            }
        }
        return housingList;
    }

    /**
     * It collects and returns the price values in it according to the class type sent to it.
     */
    public BigDecimal sumHousePrice(ArrayList<Housing> housings) {

        return housings.stream().map(Housing::getPrice).reduce(BigDecimal::add).orElse(null);
    }


    /**
     * It is a method that returns the total prices according to the specified housing type.
     */
    public BigDecimal sumHouseTypePrice(ArrayList<Housing> housings, String houseType) {

        return housings.stream().filter(housing -> Objects.equals(housing.getHouseType(), houseType))
                .map(Housing::getPrice).reduce(BigDecimal::add).orElse(null);
    }


    /**
     * A method that returns the average square meters based on the type of residence entered
     */
    public Double avarageHousingSquare(ArrayList<Housing> housings, String houseType) {

        int count = (int) housings.stream().filter(housing -> Objects.equals(housing.getHouseType(), houseType)).count();
        double housingSquare = housings.stream().filter(housing -> Objects.equals(housing.getHouseType(), houseType))
                .mapToDouble(Housing::getSquareMeter).sum();

        return housingSquare / count;
    }

    /**
     * The method that calculates the average square meter of the residential types created.
     */
    public Double avarageHousingSquare(ArrayList<Housing> housings) {

        int count = housings.size();
        double housingSquare = housings.stream().mapToDouble(Housing::getSquareMeter).sum();

        return housingSquare / count;
    }


    /**
     * A method that filters all types of houses according to the number of rooms and halls and returns
     */
    public List<Housing> filterHousing(ArrayList<Housing> housingArrayList, int roomCount, int saloonCount) {

        return housingArrayList.stream().filter(h -> h.getRoomCount() == roomCount).
                filter(h -> h.getSaloonCount() == saloonCount).toList();
    }

}
