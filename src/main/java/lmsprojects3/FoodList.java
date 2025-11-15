package lmsprojects3;

import java.util.ArrayList;
import java.util.List;

public class FoodList {


   static List<PojoFood> foodList = new ArrayList<>();


    public void foodListMethod() {
//kendime bir pojofood türü oluşturdum sonra o tipin nesnesini listenin içinde oluşturup sakladım
        //ANA YEMEKLER
        foodList.add(new PojoFood("Tavuk Döner", 85,Categories.MAIN));
        foodList.add(new PojoFood("Et Döner", 120,Categories.MAIN));
        foodList.add(new PojoFood("İskender", 160,Categories.MAIN));
        foodList.add(new PojoFood("Köfte Porsiyon", 140,Categories.MAIN));
        foodList.add(new PojoFood("Tavuk Izgara ", 130,Categories.MAIN));
        foodList.add(new PojoFood("Et Sote ", 200,Categories.MAIN));
        foodList.add(new PojoFood("Mantı  ", 110,Categories.MAIN));
        foodList.add(new PojoFood("Karışık Kebap ", 350 ,Categories.MAIN));

//🥗 APERATİFLER
        foodList.add(new PojoFood("Patates Kızartması", 60,Categories.APPETIZER));
        foodList.add(new PojoFood("Sigara Böreği", 55,Categories.APPETIZER));
        foodList.add(new PojoFood("Mercimek Çorbası", 45,Categories.APPETIZER));
        foodList.add(new PojoFood("Ezogelin Çorbası", 45,Categories.APPETIZER));
        foodList.add(new PojoFood("Soğan Halkası", 70,Categories.APPETIZER));
        foodList.add(new PojoFood("Mozzarella Stick", 85,Categories.APPETIZER));
        foodList.add(new PojoFood("Humus", 65,Categories.APPETIZER));
        foodList.add(new PojoFood("Acılı Ezme", 50,Categories.APPETIZER));

//🥤 İÇECEKLER
        foodList.add(new PojoFood("Ayran", 20,Categories.DRINK));
        foodList.add(new PojoFood("Kola", 35,Categories.DRINK));
        foodList.add(new PojoFood("Fanta", 35,Categories.DRINK));
        foodList.add(new PojoFood("Sprite", 35,Categories.DRINK));
        foodList.add(new PojoFood("Soda", 25,Categories.DRINK));
        foodList.add(new PojoFood("Ice Tea", 35,Categories.DRINK));
        foodList.add(new PojoFood("Şalgam", 30,Categories.DRINK));
        foodList.add(new PojoFood("Su", 10,Categories.DRINK));

//🍰 Tatlılar (istersen)


        foodList.add(new PojoFood("Künefe", 90,Categories.DESSERT));
        foodList.add(new PojoFood("Baklava", 120,Categories.DESSERT));
        foodList.add(new PojoFood("Profiterol", 80,Categories.DESSERT));
        foodList.add(new PojoFood("Sütlaç", 60,Categories.DESSERT));


    }


}