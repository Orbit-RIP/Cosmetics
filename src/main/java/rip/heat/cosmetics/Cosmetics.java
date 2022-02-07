package rip.heat.cosmetics;

import cc.fyre.proton.Proton;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoDatabase;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;
import rip.heat.cosmetics.handlers.ArmorHandler;
import rip.heat.cosmetics.listener.CosmeticListener;

public class Cosmetics extends JavaPlugin {

    public static String MONGO_DB_NAME = "Cosmetics";
    @Getter
    private MongoDatabase mongoDatabase;
    @Getter
    private static Cosmetics instance;
    @Getter
    private static ArmorHandler handler;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        saveDefaultConfig();
        registerListeners();
        loadMongo();
        registerCommands();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        instance = null;
    }

    public void registerListeners() {
        getServer().getPluginManager().registerEvents(new CosmeticListener(), this);
    }

    public void registerCommands() {
        Proton.getInstance().getCommandHandler().registerAll(this);
    }

    private void loadMongo() {
        try {
            final ServerAddress serverAddress = new ServerAddress(instance.getConfig().getString("mongo.host"), instance.getConfig().getInt("mongo.port"));

            MongoClient mongoClient;

            mongoClient = new MongoClient(serverAddress);
            this.mongoDatabase = mongoClient.getDatabase(instance.getConfig().getString("mongo.database"));
        } catch (Exception ex) {
            instance.getLogger().warning("Failed to connect to mongo on " + instance.getConfig().getString("mongo.host") + ".");
            ex.printStackTrace();
        }
    }

}
