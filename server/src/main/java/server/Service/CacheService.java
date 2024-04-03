package server.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;
import java.util.Objects;

@Service
public class CacheService {

    private CacheManager cacheManager;
    public static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    public CacheService(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    public CacheService() {
    }

    public void evictAllCaches() {
        cacheManager.getCacheNames().forEach(cacheName -> Objects.requireNonNull(cacheManager.getCache(cacheName)).clear());
        LOGGER.info("Cache deleted!");
    }
}
