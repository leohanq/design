package pattern.design.factory.abstractmethod.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServiceFactoryImpl {

    @Value("${default.family}")
    private String family_type;

    @Autowired
    private WSServiceFactory wsServiceFactory;

    @Autowired
    private RestServiceFactory restServiceFactory;

    public ServiceFactory createServiceFactory() {
        switch (family_type) {
            case "WSService":
                return wsServiceFactory;
            case "RestService":
                return restServiceFactory;
            default:
                throw new RuntimeException("Type not supported");
        }
    }
}