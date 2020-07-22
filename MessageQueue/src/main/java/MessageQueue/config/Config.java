package MessageQueue.config;

import com.blade.Blade;
import com.blade.ioc.annotation.Bean;
import com.blade.loader.BladeLoader;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.jms.core.JmsTemplate;
@Bean
public class Config /* implements BladeLoader */{


    // private JmsTemplate jmsTemplate;
    // private ActiveMQConnectionFactory connectionFactory;

    // @Override
    // public void load(Blade blade) {
    //     this.connectionFactory = new ActiveMQConnectionFactory();
    //     connectionFactory.setBrokerURL(blade.environment().getOrNull("spring.activemq.broker-url"));
    //     connectionFactory.setUserName(blade.environment().getOrNull("spring.activemq.user"));
    //     connectionFactory.setPassword(blade.environment().getOrNull("spring.activemq.password"));
    //     this.jmsTemplate = new JmsTemplate(connectionFactory);

    // }


    // public JmsTemplate getJmsTemplate(){
    //     return this.jmsTemplate;
    // }
    // public void setJmsTemplate(JmsTemplate jmsT){
    //     this.jmsTemplate = jmsT;
    // }
    
}