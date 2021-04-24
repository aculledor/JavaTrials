/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author aculledor
 */
public class pro {
    
    File myObj;
    Scanner myReader;
   private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public pro() {
        this.work2();
    }
    
    public void work(){
        try {
            myObj = new File("rr1.txt");
            myReader = new Scanner(myObj);
//            final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
//            executorService.scheduleAtFixedRate(() -> {
//                if (myReader.hasNextLine()) {
//                    String data = myReader.nextLine();
//                    System.out.println(data);
//                }
//            }, 0, 1, TimeUnit.SECONDS);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
                Thread.sleep(1000);
            }
            myReader.close();
        } catch (FileNotFoundException ex) {
          System.out.println("An error occurred.");
          ex.printStackTrace();
        } catch (InterruptedException ex) {
            Logger.getLogger(pro.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    public void work2(){
        try {
            File myObj = new File("rr1.txt");
            Scanner myReader = new Scanner(myObj);
            Runnable beeper = () -> {
                if (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
            };
            ScheduledFuture<?> beeperHandle = scheduler.scheduleAtFixedRate(beeper, 0, 1, TimeUnit.SECONDS);
//            Runnable canceller = () -> beeperHandle.cancel(false);
//            scheduler.schedule(canceller, 1, TimeUnit.HOURS);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    } 
    
    
}
