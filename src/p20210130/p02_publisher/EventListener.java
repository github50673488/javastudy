package p20210130.p02_publisher;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
