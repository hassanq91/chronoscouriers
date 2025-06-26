package com.mize.syncron.structure;

//Rider.java

public class DeliveryBoy {
 public enum RiderType { NORMAL, FRAGILE_CAPABLE }

 private final String id;
 private boolean available;
 private int load;
 private final double reliabilityRating;
 private final RiderType riderType;

 public DeliveryBoy(String id, boolean available, double reliabilityRating, RiderType riderType) {
     this.id = id;
     this.available = available;
     this.reliabilityRating = reliabilityRating;
     this.riderType = riderType;
     this.load = 0;
 }

 public String getId() { return id; }
 public boolean isAvailable() { return available; }
 public void setAvailable(boolean available) { this.available = available; }
 public int getLoad() { return load; }
 public void incrementLoad() { load++; }
 public void decrementLoad() { if (load > 0) load--; }
 public double getReliabilityRating() { return reliabilityRating; }
 public RiderType getRiderType() { return riderType; }

 @Override
 public String toString() {
     return "Rider{" +
             "id='" + id + '\'' +
             ", available=" + available +
             ", load=" + load +
             ", rating=" + reliabilityRating +
             ", type=" + riderType +
             '}';
 }
} 

