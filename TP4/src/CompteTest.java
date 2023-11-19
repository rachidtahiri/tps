import java.util.ArrayList;

public class CompteTest {
   private CompteService compteService=new CompteService();
   private ArrayList<compte> comptes=new ArrayList<>();

   public void init(){
       comptes.add(new compte("c1",100,true));
       comptes.add(new compte("c2",200,true));
       comptes.add(new compte("c3",300,true));
   }
    public  void  fermerTest(){
        String rib ="c2";
        int res=compteService.fermer(rib,comptes);
        System.out.println("res = " + res);
    }

   public  void tansfererTest()
   {
       String ribSource="c1";
       String ribdestination="c2";
       int resTransfer=compteService.transferer(ribSource,ribdestination,20,comptes);
       System.out.println("resTransfer = " + resTransfer);
   }
   public void findByRibTest(){
       String rib="c1";
       compte c=compteService.findByRib(rib,comptes);
       System.out.println("compte = " + c);
   }
   public static void main(String[] args) {
    CompteTest compteTest=new CompteTest();
    compteTest.init();
    compteTest.fermerTest();
    compteTest.tansfererTest();
    compteTest.findByRibTest();
    }
}


