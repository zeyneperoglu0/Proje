package eticaret;

import lmsprojects2.Register;

import java.util.List;
import java.util.Scanner;

public class CustomerService {


   private Scanner input = ProductController.inp;

    private Repository repository = new CustomerRepository();
    Register r = new Register();

    public void createTable(){
        repository.createTable();
    }

    public String emailControl(String email){
       do {

        if (email.startsWith("@")){
            System.out.println("e-mail @ işareti ile başlayamaz");


        } else if (!email.contains("@")) {

            System.out.println("Girdiğiniz e-mailde \"@\" işareti eksik");
        } else if (email.replaceAll("[^@]", "").length()>1) {
            System.out.println("E-mail birden fazla '@' içeremez");

        }else {

            String first = email.split("@")[0];
            String second = email.split("@")[1];

            boolean a =    first.replaceAll("[a-zA-Z-0-9._-]","").length()==0;
            boolean b = second.equals("gmail.com")||second.equals("hotmail.com")||second.equals("yahoo.com");

            if (!a){
                System.out.println("Email harf,rakam ve -._ dışında karakter içeremez");
            } else if (!b) {
                System.out.println("Lütfen geçerli bir email giriniz ");
            }else {
                return email;

            }
            }
    }while (true);
    }

    public String phoneNumberControl(String phone){
        do {

            if (!phone.startsWith("0")){
                System.out.println("Telefon numarasının başında 0 olmalıdır");

            }else if (phone.length()!=11  ){
                System.out.println("Lütfen geçerli bir telefon numarası giriniz");
            }else {
                return phone;
            }

        }while (true);
    }



    //kullanıcıdan bilgileri alacağız ve customer nesnesi oluşturacağız
   public Customer getCustomerInfo (){

       System.out.println("AD-SOYAD : ");
        String ad = input.nextLine();

       System.out.println("E-MAİL : ");
       String email = input.nextLine();
    emailControl(email);
       System.out.println("TELEFON : ");
       String phone = input.nextLine();
       phoneNumberControl(phone);
       Customer customer = new Customer(ad,email,phone);

  return customer; }


   public void saveCustomer (Customer newCustomer)
   {

   repository.save(newCustomer);

   }

  public void printAllCustomer(){
  List <Customer> customerList = repository.findAll();

      System.out.println("---------- Tüm Müşteriler ---------- ");
for (Customer customer : customerList){

    System.out.println("id : " + customer.getId()
            + "Ad-Soyad : " + customer.getName()
            +" Email  : " +  customer.getEmail()+
             " Telefon : " + customer.getPhone());









}
  }
    //5----------------
// Metot: Belirli bir ID'ye sahip öğrenciyi Repository katmanından bulur.
// Eğer öğrenci bulunamazsa konsola uyarı mesajı yazdırır.

    public Customer getCustomerById (int id){

        Customer c =(Customer) repository.findById(id);

        if (c == null){

            System.out.println("Bu ID'li bir müşteri bulunamadı");
        }
 return c; }


   public  void printCustomerById(int id ){

Customer customer = getCustomerInfo();

if (customer != null){
    System.out.println(customer);

}








   }


public void updateCustomer( int id ){

Customer found = getCustomerById(id);

if (found!=null){
   Customer newCustomer =  getCustomerInfo();
   repository.update(newCustomer,id);
}

}


public  void  deleteCustomer (int id){

  getCustomerById(id);
  repository.deleteById(id);









}





















}
