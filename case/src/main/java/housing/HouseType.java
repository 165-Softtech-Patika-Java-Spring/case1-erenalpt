package housing;

public enum HouseType {

    HOUSE("House"),
    VILLA("Villa"),
    SUMMER_HOUSE("SummerHouse");

    public final String houseType;

    HouseType(String houseType) {
        this.houseType = houseType;
    }

}
