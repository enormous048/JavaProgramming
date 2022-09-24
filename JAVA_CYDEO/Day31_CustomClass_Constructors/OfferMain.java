package Day31_CustomClass_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferMain {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setInfo("Apple", "Cupertino", "SDET", 90000, true, true, true, true);

        Offer offer2 = new Offer();
        offer2.setInfo("Google", "Silicon Valley", "SDET", 120000, false, true, true, false);

        Offer offer3 = new Offer();
        offer3.setInfo("Oracle", "Silicon Valley", "Engineer", 70000, false, false, false, false);

        Offer offer4 = new Offer();
        offer4.setInfo("Tesla", "Austin", "CarSoftwareDev", 80000, true, false, false, true);

        Offer offer5 = new Offer();
        offer5.setInfo("Meta", "Silicon Valley", "Software", 95000, false, false, true, false);


        ArrayList<Offer> allOffers = new ArrayList<>();
        allOffers.addAll(Arrays.asList(offer1,offer2, offer3, offer4, offer5));

        ArrayList<Offer> isForSdet = new ArrayList<>(allOffers);
        isForSdet.removeIf(p -> !p.Jobtitle.equals("SDET"));

        ArrayList<Offer> moreThan90k = new ArrayList<>(allOffers);
        moreThan90k.removeIf(p -> p.salary<90000);

        ArrayList<Offer> isFullTime = new ArrayList<>(allOffers);
        isFullTime.removeIf(p-> p.isFullTime == false);

        ArrayList<Offer> inSilicon = new ArrayList<>(allOffers);
        inSilicon.removeIf(p -> !p.location.equals("Silicon Valley"));

        ArrayList<Offer> withBenefit = new ArrayList<>(allOffers);
        withBenefit.removeIf(p-> p.hasBenefit == false);

        for (Offer offer : inSilicon) {
            System.out.println(offer.companyName);
        }


    }
}
