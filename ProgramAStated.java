class Parcel {
    String parcelId;

    Parcel(String parcelId) {
        this.parcelId = parcelId;
    }
}

class Locker {
    int lockerNo;
    Parcel parcel;

    Locker(int lockerNo) {
        this.lockerNo = lockerNo;
    }
}

class Recipient {
    String name;

    Recipient(String name) {
        this.name = name;
    }
}

public class ProgramAStated {
    public static void main(String[] args) {

        Parcel p = new Parcel("PKG-601");
        Locker l = new Locker(101);
        Recipient r = new Recipient("Anish");

        l.parcel = p;

        System.out.println("Parcel ID: " + p.parcelId);
        System.out.println("Locker No: " + l.lockerNo);
        System.out.println("Recipient: " + r.name);
        System.out.println("Locker contains: " + l.parcel.parcelId);

        System.out.println("\nReference Trace:");
        System.out.println("p -> Parcel(" + p.parcelId + ")");
        System.out.println("l -> Locker(" + l.lockerNo + ")");
        System.out.println("r -> Recipient(" + r.name + ")");
        System.out.println("l.parcel -> p");
    }
}