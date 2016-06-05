/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.ocp.chapter09;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

/**
 *
 * @author SAMI
 */
public class WatchServiceTest {
    public static void main(String[] args) throws IOException {
        Path dir = Paths.get("F:/dir");
        WatchService watcher = FileSystems.getDefault().newWatchService();
        dir.register(watcher, StandardWatchEventKinds.ENTRY_DELETE);
        
        while(true){
            WatchKey key;
            try{
             key= watcher.take();
            }catch(InterruptedException x){
                return;
            }
            
            for(WatchEvent<?> event: key.pollEvents()){
                WatchEvent.Kind<?> kind = event.kind();
                System.out.println(kind.name());
                System.out.println(kind.type());
                System.out.println(event.context());
                
                String name = event.context().toString();
                
                if(name.equals("directoryToDelete")){
                    System.out.format("Directory deleted, now we can proceed");
                    return;
                }
            }
            key.reset();
        }
    }
}
