package com.shopping;

class Payment implements Invoice 
{
    private int paymentId;
    private double amount;
    private String paymentStatus;

    public Payment(int paymentId, double amount) 
    {
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentStatus = "SUCCESS";
    }

    @Override // Implementing interface method
    public void generateReceipt()
    {
        StringBuilder sb = new StringBuilder();

        sb.append("Receipt Id : ")
          .append(paymentId)
          .append("\n");

        sb.append("Amount : ")
          .append(amount)
          .append("\n");

        sb.append("Status : ")
          .append(paymentStatus);

        System.out.println(sb);
    }
}
