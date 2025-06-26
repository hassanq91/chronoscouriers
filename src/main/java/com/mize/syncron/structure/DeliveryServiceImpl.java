package com.mize.syncron.structure;

//Assignment.java

public class DeliveryServiceImpl {
 private final String packageId;
 private final String riderId;
 private final long pickupTime;
 private long deliveryTime;

 public DeliveryServiceImpl(String packageId, String riderId, long pickupTime) {
     this.packageId = packageId;
     this.riderId = riderId;
     this.pickupTime = pickupTime;
     this.deliveryTime = -1;
 }

 public String getPackageId() { return packageId; }
 public String getRiderId() { return riderId; }
 public long getPickupTime() { return pickupTime; }
 public long getDeliveryTime() { return deliveryTime; }
 public void completeDelivery() { this.deliveryTime = System.currentTimeMillis(); }

 @Override
 public String toString() {
     return "Assignment{" +
             "packageId='" + packageId + '\'' +
             ", riderId='" + riderId + '\'' +
             ", pickupTime=" + pickupTime +
             ", deliveryTime=" + deliveryTime +
             '}';
 }
} 
