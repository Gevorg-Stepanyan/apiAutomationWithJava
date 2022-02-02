package Models.RequestModels;

public class BookingdatesRequestModel {

      private String CheckIn;
      private String CheckOut;

      public BookingdatesRequestModel(String checkIn, String checkOut) {
            CheckIn = checkIn;
            CheckOut = checkOut;
      }

      public String getCheckIn() {
            return CheckIn;
      }

      public void setCheckIn(String checkIn) {
            CheckIn = checkIn;
      }

      public String getCheckOut() {
            return CheckOut;
      }

      public void setCheckOut(String checkOut) {
            CheckOut = checkOut;
      }

      @Override
      public String toString() {
            return "BookingdatesRequestModel{" +
                    "CheckIn='" + CheckIn + '\'' +
                    ", CheckOut='" + CheckOut + '\'' +
                    '}';
      }
}
