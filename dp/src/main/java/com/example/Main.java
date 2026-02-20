package com.example;

import com.example.FMP.FileSource;
import com.example.FMP.MigrationTool;
import com.example.FMP.Source;
import com.example.FMP.SqlSource;
import com.example.OP.MobileApp;
import com.example.OP.NewsAgency;
import com.example.OP.NewsPaper;
import com.example.OP.TvChannel;
import com.example.PP.ThirdPartyYoutubeLibCached;
import com.example.SP.GameConfig;

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

        ThirdPartyYoutubeLibCached api = new ThirdPartyYoutubeLibCached();
        api.getVideo("cats_playing.mp4");
        api.getVideo("cats_playing.mp4");
        api.getVideo("wydad_highlights.mp4");
    }
}