package br.com.rafasl1.hrpayroll.domain.entities;

public interface WorkerClient {
    public Worker getWorker(long workerId, int days);
}
