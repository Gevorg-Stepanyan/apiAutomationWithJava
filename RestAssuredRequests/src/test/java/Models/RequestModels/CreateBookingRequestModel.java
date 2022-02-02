package Models.RequestModels;

public class CreateBookingRequestModel {

      private String FirstName;
      private String LastName;
      private int  TotalPrice;
      private boolean Depositpaid;
      private BookingdatesRequestModel BookingDates;
      private String Additionalneeds;

      public CreateBookingRequestModel(String firstName, String lastName, int totalPrice, boolean depositpaid, BookingdatesRequestModel bookingDates, String additionalneeds) {
            FirstName = firstName;
            LastName = lastName;
            TotalPrice = totalPrice;
            Depositpaid = depositpaid;
            BookingDates = bookingDates;
            Additionalneeds = additionalneeds;
      }

      public String getFirstName() {
            return FirstName;
      }

      public void setFirstName(String firstName) {
            FirstName = firstName;
      }

      public String getLastName() {
            return LastName;
      }

      public void setLastName(String lastName) {
            LastName = lastName;
      }

      public int getTotalPrice() {
            return TotalPrice;
      }

      public void setTotalPrice(int totalPrice) {
            TotalPrice = totalPrice;
      }

      public boolean isDepositpaid() {
            return Depositpaid;
      }

      public void setDepositpaid(boolean depositpaid) {
            Depositpaid = depositpaid;
      }

      public BookingdatesRequestModel getBookingDates() {
            return BookingDates;
      }

      public void setBookingDates(BookingdatesRequestModel bookingDates) {
            BookingDates = bookingDates;
      }

      public String getAdditionalneeds() {
            return Additionalneeds;
      }

      public void setAdditionalneeds(String additionalneeds) {
            Additionalneeds = additionalneeds;
      }

      @Override
      public String toString() {
            return "CreateBookingRequestModel{" +
                    "FirstName='" + FirstName + '\'' +
                    ", LastName='" + LastName + '\'' +
                    ", TotalPrice=" + TotalPrice +
                    ", Depositpaid=" + Depositpaid +
                    ", BookingDates=" + BookingDates +
                    ", Additionalneeds='" + Additionalneeds + '\'' +
                    '}';
      }
}
