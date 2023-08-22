package br.com.rafasl1.hrpayroll.infrastructure;

import br.com.rafasl1.hrpayroll.domain.entities.Worker;
import br.com.rafasl1.hrpayroll.domain.entities.WorkerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Component
public class WorkerRestClient implements WorkerClient {

    @Value("${hr-worker.host}")
    private String workerHost;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Worker getWorker(long workerId, int days) {
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("id", String.valueOf(workerId));
        String resourceHost = workerHost + "/workers/{id}";

        return restTemplate.getForObject(resourceHost, Worker.class, uriVariables);
    }

}
