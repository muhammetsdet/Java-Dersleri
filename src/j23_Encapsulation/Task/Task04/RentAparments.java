package j23_Encapsulation.Task.Task04;

public class RentAparments {
    /*
    Task
     Runner ve rentApartments Class'ları create ediniz
    rentApartments Class'ında data hiding->encapsulated
    Bu variable'ları create ediniz
    String name
    int roomCount
    boolean balconyOrNo



    4 farklı Apartment(apartman dairesi) vardır. 0, 1, 2, 3 rooms(odalı)
    -----------------------------------------------------------------
    Bir method oluşturun;
    Eğer room sayısı 0 ise,
    rent(kira) 1400
    Eğer oda sayısı 1 ise,
    rent  1700
    Eğer oda sayısı 2 ise,
    rent 2200
    Eğer oda sayısı 3 ise,
    rent 2700
    rent'i return'leyin.
    ----------------------------------------------------------------
    Bir method oluşturun.
    Eğer balconyOrNo  true ise,
    rent'e 200 dollar ekleyin.

    Runner class  içinde;
    userName rent is amountOfRent(... kiracı nın datalarını -> oda saysı, balkon isteği ,kira miktarı) print eden code create ediniz
     */
   private String name;
   private int roomCount;
   private boolean balconyOrNo;
   private int rent;

    public RentAparments(String name, int roomCount, boolean balconyOrNo) {
        this.name = name;
        this.roomCount = roomCount;
        this.balconyOrNo = balconyOrNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public int getBalconyOrNo() {
        if (balconyOrNo){
            return 200;
        }else return 0;

    }

    public void setBalconyOrNo(boolean balconyOrNo) {
        this.balconyOrNo = balconyOrNo;
    }

    @Override
    public String toString() {
        return
                "Your name is= " + name +
                "\nroomCount= " + roomCount +
                "\nbalconyOrNo= " + balconyOrNo+ "\nYour payments are= "+numberOfRooms() ;
    }
    public int numberOfRooms() {
        if (roomCount == 0) {
            this.rent = 1400;
        } else if (roomCount == 1) {
           this.rent = 1700;
        }
        if (roomCount == 2) {
            this.rent = 2200;
        } else if (roomCount == 3) {
            this.rent = 2700;
        }
        return this.rent+=getBalconyOrNo();
    }
    }

