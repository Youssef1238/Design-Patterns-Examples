package com.example;

import com.example.AP.AudioPlayer;
import com.example.BP.Computer;
import com.example.CP.RemoteControl;
import com.example.CP.SetTempCommand;
import com.example.CP.Receivers.AC;
import com.example.CompositeP.Box;
import com.example.CompositeP.Product;
import com.example.DP.EmailNotifier;
import com.example.DP.INotifier;
import com.example.DP.SMSNotifierDecorator;
import com.example.DP.SlackNotifierDecorator;
import com.example.FMP.FileSource;
import com.example.FMP.MigrationTool;
import com.example.FMP.Source;
import com.example.FMP.SqlSource;
import com.example.FP.CloudProviderFacade;
import com.example.OP.MobileApp;
import com.example.OP.NewsAgency;
import com.example.OP.NewsPaper;
import com.example.OP.TvChannel;
import com.example.PP.ThirdPartyYoutubeLibCached;
import com.example.SP.GameConfig;
import com.example.StateP.Document;
import com.example.StrategyP.CryptoStrategy;
import com.example.StrategyP.PaypalStrategy;
import com.example.StrategyP.ShoppingCart;
import com.example.TMethodP.Coffe;
import com.example.TMethodP.HotBeverage;
import com.example.TMethodP.Tea;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /* MigrationTool mt = new MigrationTool();
        mt.migrate("sql"); */
        /* MigrationTool mt = new MigrationTool() {
            protected Source createSource(){
                return new FileSource();
            }
        };
        mt.migrate();
        mt = new MigrationTool() {
            protected Source createSource(){
                return new SqlSource();
            }
        };
        mt.migrate(); */
        /* Thread t1 = new Thread(()->GameConfig.getInstance());
        Thread t2 = new Thread(()->GameConfig.getInstance());
        t1.start();
        t2.start(); */


        /* MobileApp ma = new MobileApp();
        TvChannel tc = new TvChannel();

        NewsAgency newsAgency = new NewsAgency(tc, ma);
        newsAgency.setNews("Moroocan Football National Team lost the cup in a drama full scenario ..."); */

        /* MobileApp ma = new MobileApp();
        TvChannel tc = new TvChannel();
        NewsPaper np = new NewsPaper();

        NewsAgency newsAgency = new NewsAgency();
        newsAgency.subscribe(np);
        newsAgency.subscribe(ma);
        newsAgency.subscribe(tc);
        newsAgency.setNews("Moroocan Football National Team lost the cup in a drama full scenario ...");

        newsAgency.unsubscribe(tc);
        newsAgency.setNews("Wydad Casablanca are releasing new tea cups following their new independent brand ..."); */

        /* ThirdPartyYoutubeLibCached api = new ThirdPartyYoutubeLibCached();
        api.getVideo("cats_playing.mp4");
        api.getVideo("cats_playing.mp4");
        api.getVideo("wydad_highlights.mp4"); */


        /* String message = "Dexter's birthday is tomorrow !";
        INotifier alert = new EmailNotifier();
        alert = new SMSNotifierDecorator(alert);
        alert = new SlackNotifierDecorator(alert);
        alert.send(message); */

        /* ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(15);
        shoppingCart.addItem(10);
        shoppingCart.checkout();
        shoppingCart.setPaymentStrategy(new CryptoStrategy());
        shoppingCart.checkout();
        shoppingCart.setPaymentStrategy(new PaypalStrategy());
        shoppingCart.checkout(); */

        /* AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "file.mp3");
        audioPlayer.play("mp4", "file.mp4");
        audioPlayer.play("vlc", "file.vlc");
        audioPlayer.play("avi", "file.avi"); */

        /* CloudProviderFacade cloudProvider = new CloudProviderFacade();
        cloudProvider.deployWebsite(); */

        /* AC ac = new AC(12);
        RemoteControl remoteControl = new RemoteControl();
        SetTempCommand setTempCommand = new SetTempCommand(ac);
        setTempCommand.setTargetTemp(24);
        remoteControl.pressButton(setTempCommand);
        System.out.println("target: " + ac.getTargetTemp());
        setTempCommand.setTargetTemp(40);
        remoteControl.pressButton(setTempCommand);
        System.out.println("target: " + ac.getTargetTemp());
        remoteControl.pressUndo();
        System.out.println("target: " + ac.getTargetTemp());
        remoteControl.pressUndo();
        System.out.println("target: " + ac.getTargetTemp());
        remoteControl.pressUndo();
        System.out.println("target: " + ac.getTargetTemp()); */

        /* Document document = new Document();
        document.publish();
        document.publish();
        document.publish();
        document.publish(); */

        /* HotBeverage myTea = new Tea();
        myTea.prepareRecipe();
        System.out.println("-------------------------------------");
        HotBeverage myCoffe = new Coffe();
        myCoffe.prepareRecipe(); */

        /* Product phone = new Product("Phone", 1000);
        Product charger = new Product("Charger", 50);
        Product earphones = new Product("Earphones", 100);

        Box smallBox = new Box();
        smallBox.add(charger); smallBox.add(earphones);

        Box bigBox = new Box();
        bigBox.add(phone);
        bigBox.add(smallBox);

        System.out.println("Total price: " + bigBox.getPrice()); */


        Computer computer = new Computer.ComputerBuilder("i5", 16)
        .setCooler(true)
        .setWIFI(true)
        .build();

        System.out.println(computer.toString());
    }
}