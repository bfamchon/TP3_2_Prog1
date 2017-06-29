package unip.akka;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import unip.reducers.Reducer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by baptiste on 08/06/17.
 * Hi
 */
public class AkkaProcess {

    private ActorSystem system;

    public AkkaProcess() {
        this.system = ActorSystem.create("MySystem1");
    }

    public void run() {
        List<ActorRef> reducers = new ArrayList<>();

        reducers.add(this.system.actorOf(Props.create(Reducer.class, "red0"), "red0"));
        reducers.add(this.system.actorOf(Props.create(Reducer.class, "red1"), "red1"));
    }
}