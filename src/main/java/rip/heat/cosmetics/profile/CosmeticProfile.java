package rip.heat.cosmetics.profile;

import com.mongodb.client.MongoCollection;
import lombok.Getter;
import lombok.Setter;
import org.bson.Document;
import rip.heat.cosmetics.Cosmetics;
import rip.heat.cosmetics.handlers.CosmeticType;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class CosmeticProfile {
    @Getter
    private static Map<UUID, CosmeticProfile> profiles = new HashMap<>();
    private static MongoCollection<Document> collection = Cosmetics.getInstance().getMongoDatabase().getCollection("profiles");

    @Getter private final UUID uuid;
    @Getter @Setter
    private String name;
    private CosmeticType type;

    public CosmeticProfile(UUID uuid) {
        this.uuid = uuid;
    }


}
