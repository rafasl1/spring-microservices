package br.com.rafasl1.hrpayroll.domain.services;

import br.com.rafasl1.hrpayroll.domain.entities.Payment;
import br.com.rafasl1.hrpayroll.domain.entities.Worker;
import br.com.rafasl1.hrpayroll.domain.entities.WorkerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PaymentService {

    private WorkerClient workerClient;

    @Autowired
    public PaymentService(WorkerClient workerClient) {
        this.workerClient = workerClient;
    }

    public Payment getPayment(long workerId, int days) {
        Worker worker = workerClient.getWorker(workerId, days);
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }

}
