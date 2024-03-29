
public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter){
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
	
	public boolean larger (Apartment otherApartment) {
		if (this.squareMeters > otherApartment.squareMeters) {
			return true;
		} else {
			return false;
		}
	}
	
	public int priceDifference(Apartment otherApartment){
		int thisPrice = this.squareMeters * this.pricePerSquareMeter;
		int otherPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
		int priceDiff = Math.abs(thisPrice - otherPrice);
		return priceDiff;
	};
	
	public boolean moreExpensiveThan(Apartment otherApartment) {
		int thisPrice = this.squareMeters * this.pricePerSquareMeter;
		int otherPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
		
		if (thisPrice > otherPrice) {
			return true;
		} else {
			return false;
		}
	}
}