package wjw.entity;

import lombok.Data;
import org.springframework.cloud.alibaba.sentinel.datasource.config.AbstractDataSourceProperties;

/**
 * @author : wangjianwei
 * @version : 1.0
 * @date : 2020/10/30 15:55
 **/
@Data
public class NacosDataSourceProperties extends AbstractDataSourceProperties {
    private String serverAddr;
    private String groupId;
    private String dataId;

    // commercialized usage,下面三项是商业定制版可以使用的工具
    private String endpoint;
    private String namespace;
    private String accessKey;
    private String secretKey;

    public NacosDataSourceProperties(String factoryBeanName) {
        super(factoryBeanName);
    }
}
