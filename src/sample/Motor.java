package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class Motor {
    public String UserName;
    public  String gender;
    public String StartedPokemon;

    public Motor()
    {

    }

    public void setStartingData(String UserName,String gender,String StartedPokemon)
    {
        this.UserName = UserName;
        this.gender = gender;
        this.StartedPokemon = StartedPokemon;
        System.out.println(this.UserName + " "+ this.gender + " " + this.StartedPokemon);
    }
    public void showPantalla_Inicial(javafx.event.ActionEvent event)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Pantalla_Inicial.fxml"));
            Parent root = loader.load();
            Pantalla_Inicial controller = loader.<Pantalla_Inicial>getController();
          //  Pantalla_Inicial controller = loader.<Pantalla_Inicial>getController();
            controller.receiveMotorInstance(this);
            controller.getClass();
            Scene Pantalla_InicialScene = new Scene(root);

            Stage currentStage = (Stage)((Node) event.getSource()).getScene().getWindow();
            currentStage.hide();
            currentStage.setScene(Pantalla_InicialScene);
            currentStage.show();
        }
        catch (Exception e)
        {
            System.out.println("E R R O R");
        }
    }

    public void showSelectArea(javafx.event.ActionEvent event)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("SelectArea.fxml"));
            Parent root = loader.load();
            SelectArea controller = loader.<SelectArea>getController();
            controller.receiveMotorInstance(this);
            controller.receiveInitialData(StartedPokemon,gender);
            Scene selectAreaScene = new Scene(root);

            Stage currentStage = (Stage)((Node) event.getSource()).getScene().getWindow();
            currentStage.hide();
            currentStage.setScene(selectAreaScene);
            currentStage.show();
        }
        catch (Exception e)
        {
            System.out.println("E R R O R");
        }
    }

    public void getPokemonByName(String Nombre)
    {
        Pokemon toReturnPokemon = new Pokemon();
        //for(int i=0; i<)
        {

        }
    }
    public void AllPokemons()
    {
        Pokemon Balbasaur  = new Pokemon("Balbasaur","Planta","Chico",1,50);
        //Balbasaur.setHabilidad(habilities);
        Pokemon Ivysaur = new Pokemon("Ivysaur", "Planta","Mediano",10,70);
        Balbasaur.setEvolucion(Ivysaur);
        Pokemon Venusaur = new Pokemon("Venusaur", "Planta","Grande",20,100);
        Ivysaur.setEvolucion(Venusaur);
        Pokemon Charmender = new Pokemon("Charmender","Fuego","Chico",1,50);
        Pokemon Charmeleon = new Pokemon("Charmeleon","Fuego","Mediano",10,70);
        Charmender.setEvolucion(Charmeleon);
        Pokemon Charizard = new Pokemon("Charizard","Fuego","Grande",20,100);
        Charmeleon.setEvolucion(Charizard);
        Pokemon Squirtle = new Pokemon("Squirtle","Agua","Chico",1,50);
        Pokemon Wartortle = new Pokemon("Wartotle","Agua","Mediano",10,70);
        Squirtle.setEvolucion(Wartortle);
        Pokemon Blastoise = new Pokemon("Blastoise","Agua","Grande",1,100);
        Wartortle.setEvolucion(Blastoise);
        Pokemon Caterpie = new Pokemon("Caterpie","Bicho","Chico",1,50);
        Pokemon Metapod = new Pokemon("Metapod","Bicho","Mediano",10,70);
        Caterpie.setEvolucion(Metapod);
        Pokemon Butterfree = new Pokemon("Butterfree","Bicho","Grande",1,100);
        Metapod.setEvolucion(Butterfree);
        Pokemon Weedle = new Pokemon("Weedle","Bicho","Chico",1,50);
        Pokemon Kakuna = new Pokemon("Kakuna","Bicho","Mediano",10,70);
        Kakuna.setEvolucion(Weedle);
        Pokemon Beedrill = new Pokemon("Beedrill","Bicho","Grande",1,100);
        Kakuna.setEvolucion(Beedrill);
        Pokemon Pidgey = new Pokemon("Pidgey","Volador","Chico",1,50);
        Pokemon Pidgeotto = new Pokemon("Pidgeotto","Volador","Mediano",10,70);
        Pidgey.setEvolucion(Pidgeotto);
        Pokemon Pidgeot = new Pokemon("Pidgeot","Volador","Grande",1,100);
        Pidgeotto.setEvolucion(Pidgeot);
        Pokemon Rattata = new Pokemon("Rattata","Normal", "Mediano",1,70);
        Pokemon Raticate= new Pokemon("Raticate","Normal","Grande",10,100);
        Rattata.setEvolucion(Raticate);
        Pokemon Spearow = new Pokemon("Spearow","Volador","Mediano",1,70);
        Pokemon Fearow = new Pokemon("Fearow","Volador","Grande",10,100);
        Spearow.setEvolucion(Fearow);
        Pokemon Ekans = new Pokemon("Ekans","Veneno","Mediano",1,70);
        Pokemon Arbok = new Pokemon("Arbok","Veneno","Grande",10,100);
        Ekans.setEvolucion(Arbok);
        Pokemon Pikachu = new Pokemon("Pikachu","Electrico","Mediano",1,70);
        Pokemon Raichu = new Pokemon("Raichu","Electrico","Grande",10,100);
        Pikachu.setEvolucion(Raichu);
        Pokemon Sandshrew = new Pokemon("Sandshrew","Tierra","Mediano",1,70);
        Pokemon Sandslash = new Pokemon("Sandlash","Tierra","Grande",10,100);
        Sandshrew.setEvolucion(Sandslash);
        Pokemon NidoranF = new Pokemon("Nidoran","Veneno","Chico",1,50);
        Pokemon Nidorina= new Pokemon("Nidorina","Veneno","Mediano",10,70);
        NidoranF.setEvolucion(Nidorina);
        Pokemon Nidoqueen = new Pokemon("Nidoqueen","Veneno","Grande",20,100);
        Nidorina.setEvolucion(Nidoqueen);
        Pokemon NidoranM = new Pokemon("Nidroran","Veneno","Chico",1,50);
        Pokemon Nidorino = new Pokemon("Nidrorano","Veneno","Mediano",10,70);
        NidoranM.setEvolucion(Nidorino);
        Pokemon Nidoking = new Pokemon("Nidoking","Veneno","Grande",20,100);
        Nidorino.setEvolucion(Nidoking);
        Pokemon Clefairy = new Pokemon("Clefairy","Hada","Mediano",1,70);
        Pokemon Clefable = new Pokemon("Clefable","Hada","Grande",10,100);
        Clefairy.setEvolucion(Clefable);
        Pokemon Vulpix = new Pokemon("Vulpix","Fuego","Mediano",1,70);
        Pokemon Ninetales = new Pokemon("Ninetales","Fuego","Grande",10,100);
        Vulpix.setEvolucion(Ninetales);
        Pokemon Jigglypuff = new Pokemon("Jigglepuff","Hada","Mediano",1,70);
        Pokemon Wigglytuff = new Pokemon("Wigglypuff","Hada","Grande",10,100);
        Jigglypuff.setEvolucion(Wigglytuff);
        Pokemon Zubat = new Pokemon("Zubat","Volador","Mediano",1,70);
        Pokemon Golbat = new Pokemon("Golbat","Volador","Grande",10,100);
        Zubat.setEvolucion(Golbat);
        Pokemon Oddish = new Pokemon("Oddish","Veneno","Chico",1,50);
        Pokemon Gloom = new Pokemon("Gloom","Veneno","Mediano",10,70);
        Oddish.setEvolucion(Gloom);
        Pokemon Vileplume = new Pokemon("Vilplume","Veneno","Grande",20,100);
        Gloom.setEvolucion(Vileplume);
        Pokemon Paras = new Pokemon("Paras","Insecto","Chico",1,50);
        Pokemon Parasect = new Pokemon("Parasect","Insecto","Mediano",10,70);
        Paras.setEvolucion(Parasect);
        Pokemon Venonat = new Pokemon("Venonat","Veneno","Mediano",1,70);
        Pokemon Venomoth = new Pokemon("Venomoth","Veneno","Grande",10,100);
        Venonat.setEvolucion(Venomoth);
        Pokemon Digglet = new Pokemon("Digglet","Tierra","Mediano",1,70);
        Pokemon Dugtrio = new Pokemon("Dugtrio","Tierra","Grande",10,100);
        Digglet.setEvolucion(Dugtrio);
        Pokemon Meowth = new Pokemon("Meowth","Normal","Mediano",1,70);
        Pokemon Persian = new Pokemon("Persian","Normal","Grande",10,100);
        Meowth.setEvolucion(Persian);
        Pokemon Psyduck = new Pokemon("Psyduck","Agua","Mediano",1,70);
        Pokemon Golduck= new Pokemon("Golduck","Agua","Grande",10,100);
        Psyduck.setEvolucion(Golduck);
        Pokemon Mankey = new Pokemon("Mankey","Lucha","Mediano",1,70);
        Pokemon Primeape = new Pokemon("Primeape","Lucha","Grande",10,100);
        Mankey.setEvolucion(Primeape);
        Pokemon Growlithe = new Pokemon("Growlithe","Fuego","Mediano",1,70);
        Pokemon Arcanine = new Pokemon("Arcanine","Fuego","Grande",10,100);
        Growlithe.setEvolucion(Arcanine);
        Pokemon Poliwag = new Pokemon("Poliwag","Agua","Chico",1,50);
        Pokemon Poliwhirl = new Pokemon("Poliwhril","Agua","Mediano",10,70);
        Poliwag.setEvolucion(Poliwhirl);
        Pokemon Poliwrath = new Pokemon("Poliwrarth","Agua","Grande",20,100);
        Poliwhirl.setEvolucion(Poliwrath);
        Pokemon Abra = new Pokemon("Abra","Psiquico","Chico",1,50);
        Pokemon Kadabra = new Pokemon("Kadabra","Psiquico","Mediano",10,70);
        Abra.setEvolucion(Kadabra);
        Pokemon Alakazam = new Pokemon("Alakazam","Psiquico","Grande",20,100);
        Kadabra.setEvolucion(Alakazam);
        Pokemon Machop = new Pokemon("Machop","Lucha","Chico",10,50);
        Pokemon Machoke = new Pokemon("Machoke","Lucha","Mediano",20,70);
        Machop.setEvolucion(Machoke);
        Pokemon Machamp = new Pokemon("Machamp","Lucha","Grande",30,100);
        Machoke.setEvolucion(Machamp);
        Pokemon Bellsprout = new Pokemon("Bellsprout","Planta","Chico",1,50);
        Pokemon Weepinbell = new Pokemon("Weepinbell","Planta","Mediano",10,70);
        Bellsprout.setEvolucion(Weepinbell);
        Pokemon Victreebel = new Pokemon("Victreebel","Planta","Grande",20,100);
        Weepinbell.setEvolucion(Victreebel);
        Pokemon Tentacool = new Pokemon("Tentacool","Agua","Mediano",1,70);
        Pokemon Tentacruel = new Pokemon("Tentacruel","Agua","Grande",10,100);
        Tentacool.setEvolucion(Tentacruel);
        Pokemon Geodude = new Pokemon("Grodude","Tierra","Chico",1,50);
        Pokemon Graveler = new Pokemon("Graveler","Tierra","Mediano",10,70);
        Geodude.setEvolucion(Graveler);
        Pokemon Golem = new Pokemon("Golem","Tierra","Grande",20,100);
        Graveler.setEvolucion(Golem);
        Pokemon Ponyta = new Pokemon("Ponyta","Fuego","Mediano",1,50);
        Pokemon Rapidash = new Pokemon("Rapidash","Fuego","Grande",10,100);
        Ponyta.setEvolucion(Rapidash);
        Pokemon Slowpoke = new Pokemon("Slowpoke","Psiquico","Mediano",1,70);
        Pokemon Slowbro = new Pokemon("Slowbro","Psiquico","Grande",10,100);
        Slowpoke.setEvolucion(Slowbro);
        Pokemon Magnemite = new Pokemon("Magnemite","Acero","Mediano",1,70);
        Pokemon Magneton = new Pokemon("Magneton","Acero","Grande",10,100);
        Magnemite.setEvolucion(Magneton);
        Pokemon Farfetch = new Pokemon("Farfetch","Volador","Grande",1,100);
        Pokemon Doduo = new Pokemon("Doduo","Volador","Mediano",1,70);
        Pokemon Dodrio = new Pokemon("Dodrio","Volador","Grande",10,100);
        Doduo.setEvolucion(Dodrio);
        Pokemon Seel = new Pokemon("Seel","Agua","Mediano",1,70);
        Pokemon Dewgong = new Pokemon("Dewgong","Agua","Grande",10,100);
        Seel.setEvolucion(Dewgong);
        Pokemon Grimer = new Pokemon("Grimer","Veneno","Mediano",1,70);
        Pokemon Muk = new Pokemon("Muk","Veneno","Grande",10,100);
        Grimer.setEvolucion(Muk);
        Pokemon Shellder = new Pokemon("Shellder","Agua","Mediano",1,70);
        Pokemon Cloyster = new Pokemon("Cloyster","Agua","Grande",10,100);
        Shellder.setEvolucion(Cloyster);
        Pokemon Gastly = new Pokemon("Gastly","Veneno","Chico",1,50);
        Pokemon Haunter = new Pokemon("Haunter","Veneno","Mediano",10,70);
        Gastly.setEvolucion(Haunter);
        Pokemon Gengar = new Pokemon("Gengar","Veneno","Grande",20,100);
        Haunter.setEvolucion(Gengar);
        Pokemon Onix = new Pokemon("Onix","Tierra","Grande",20,200);
        Pokemon Drowzee = new Pokemon("Drowzee","Psiquico","Mediano",1,70);
        Pokemon Hypno = new Pokemon("Hypno","Psiquico","Grande",10,100);
        Drowzee.setEvolucion(Hypno);
        Pokemon Krabby = new Pokemon("Krabby","Agua","Mediano",1,70);
        Pokemon Kingler = new Pokemon("Kingler","Agua","Grande",10,100);
        Krabby.setEvolucion(Kingler);
        Pokemon Voltorb = new Pokemon("Voltorb","Electrico","Mediano",1,70);
        Pokemon Electrode = new Pokemon("Electrode","Electrico","Grande",10,100);
        Voltorb.setEvolucion(Electrode);
        Pokemon Exeggcute = new Pokemon("Exeggcute","Psiquico","Mediano",1,70);
        Pokemon Exeggutor = new Pokemon("Exeggutor","Psiquico","Grande",10,100);
        Exeggcute.setEvolucion(Exeggutor);
        Pokemon Cubone = new Pokemon("Cubone","Tierra","Mediano",1,70);
        Pokemon Marowak = new Pokemon("Marowak","Tierra","Grande",10,100);
        Cubone.setEvolucion(Marowak);
        Pokemon Hitmonlee = new Pokemon("Hitmonlee","Lucha","Grande",10,200);
        Pokemon Hitmonchan = new Pokemon("Hitmonchan","Lucha","Grande",10,200);
        Pokemon Lickitung = new Pokemon("Lickitung","Normal","Grande",10,200);
        Pokemon Koffing = new Pokemon("Koffing","Veneno","Mediano",1,70);
        Pokemon Weezing = new Pokemon("Weezing","Veneno","Grande",10,150);
        Koffing.setEvolucion(Weezing);
        Pokemon Rhyhorn = new Pokemon("Rhyhorn","Tierra","Mediano",1,70);
        Pokemon Rhydon = new Pokemon("Rhydon","Tierra","Grande",10,180);
        Rhyhorn.setEvolucion(Rhydon);
        Pokemon Chansey = new Pokemon("Chansey","Normal","Grande",15,200);
        Pokemon Tangela = new Pokemon("Tangela","Planta","Grande",10,100);
        Pokemon Kangashkhan = new Pokemon("Kangaskhan","Normal","Grande",10,250);
        Pokemon Horsea = new Pokemon("Horsea","Agua","Mediano",1,70);
        Pokemon Seadra = new Pokemon("Seadra","Agua","Grande",10,170);
        Horsea.setEvolucion(Seadra);
        Pokemon Goldeen = new Pokemon("Goldeen","Agua","Chico",1,70);
        Pokemon Seaking = new Pokemon("Seaking","Agua","Mediano",10,100);
        Goldeen.setEvolucion(Seaking);
        Pokemon Staryu = new Pokemon("Staryu","Agua","Chico",1,70);
        Pokemon Starmie = new Pokemon("Starmie","Agua","Grande",10,100);
        Staryu.setEvolucion(Starmie);
        Pokemon MrMime = new Pokemon("Mr. Mime","Psiquico","Grande",18,200);
        Pokemon Scyther = new Pokemon("Scyther","Volador","Grande",17,250);
        Pokemon Jynx = new Pokemon("Jynx","Psiquico","Grande",15,259);
        Pokemon Electabuzz = new Pokemon("Electabuzz","Electrico","Grande",20,200);
        Pokemon Magmar = new Pokemon("Magmar","Fuego","Grande",10,140);
        Pokemon Pinsir = new Pokemon("Pinsir","Bicho","Grande",12,190);
        Pokemon Tauros = new Pokemon("Tauros","Normal","Grande",23,290);
        Pokemon Magikarp = new Pokemon("Magikarp","Agua","Chico",1,70);
        Pokemon Gyarados = new Pokemon("Gyarados","Agua","Grande",10,180);
        Magikarp.setEvolucion(Gyarados);
        Pokemon Lapras = new Pokemon("Lapras","Agua","Grande",28,250);
        Pokemon Ditto = new Pokemon("Ditto","Normal","Chico",3,70);
        Pokemon Eevee = new Pokemon("Eevee","Normal","Chico",1,50);
        Pokemon Vaporeon = new Pokemon("Vaporeon","Agua","Mediano",10,100);
        Pokemon Jolteon = new Pokemon("Jolteon","Electrico","Mediano",10,100);
        Pokemon Flareon = new Pokemon("Flareon","Fuego","Mediando",10,100);
        Eevee.setEvolucion(Vaporeon);
        Eevee.setEvolucion(Jolteon);
        Eevee.setEvolucion(Flareon);
        Pokemon Porygon = new Pokemon("Porygon","Normal","Mediano",16,180);
        Pokemon Omanyte = new Pokemon("Omanyte","Agua","Chico",1,60);
        Pokemon Omastar = new Pokemon("Omastar","Agua","Mediano",10,110);
        Omanyte.setEvolucion(Omastar);
        Pokemon Kabuto = new Pokemon("Kabuto","Agua","Mediano",2,70);
        Pokemon Kabutops = new Pokemon("Kabutops","Agua","Grande",10,120);
        Kabuto.setEvolucion(Kabutops);
        Pokemon Aerodactyl = new Pokemon("Aerodactyl","Volador","Grande",29,190);
        Pokemon Snorlax = new Pokemon("Snorlax","Normal","Grande",17,390);
        Pokemon Articuno = new Pokemon("Articuno","Volador","Grande",30,200);
        Pokemon Zapados = new Pokemon("Zapados","Volador","Grande",10,130);
        Pokemon Moltres = new Pokemon("Moltres","Fuego","Grande",28,160);
        Pokemon Dratini = new Pokemon("Dratini","Agua","Grande",10,150);
        Pokemon Dragonair = new Pokemon("Dragonair","Agua","Grande",20,250);
        Dratini.setEvolucion(Dragonair);
        Pokemon Dragonite = new Pokemon("Dragonite","Volador","Grande",30,350);
        Dragonair.setEvolucion(Dragonite);
        Pokemon MewTwo = new Pokemon("MewTwo","Psiquico","Grande",10,200);
        Pokemon Mew = new Pokemon("Mew","Psiquico","Grande",10,200);
        Pokemon Mariana = new Pokemon("Mariana","Psiquico","Chico",99,500);

        System.out.println(Balbasaur.toString());


    }
}
