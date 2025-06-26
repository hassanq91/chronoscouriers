package com.mize.syncron.structure;

//Package.java


public class Delivery implements Comparable<Delivery> {
 public enum Priority { EXPRESS, STANDARD }
 public enum Status { PENDING, ASSIGNED, DELIVERED }

 private final String id;
 private final Priority priority;
 private final long deadline;
 private final long orderTime;
 private final boolean fragile;
 private Status status;

 public Delivery(String id, Priority priority, long deadline, long orderTime, boolean fragile) {
     this.id = id;
     this.priority = priority;
     this.deadline = deadline;
     this.orderTime = orderTime;
     this.fragile = fragile;
     this.status = Status.PENDING;
 }

 public String getId() { return id; }
 public Priority getPriority() { return priority; }
 public long getDeadline() { return deadline; }
 public long getOrderTime() { return orderTime; }
 public boolean isFragile() { return fragile; }
 public Status getStatus() { return status; }
 public void setStatus(Status status) { this.status = status; }

 @Override
 public int compareTo(Delivery other) {
     if (this.priority != other.priority)
         return this.priority == Priority.EXPRESS ? -1 : 1;
     if (this.deadline != other.deadline)
         return Long.compare(this.deadline, other.deadline);
     return Long.compare(this.orderTime, other.orderTime);
 }

 @Override
 public String toString() {
     return "Package{" +
             "id='" + id + '\'' +
             ", priority=" + priority +
             ", deadline=" + deadline +
             ", status=" + status +
             '}';
 }
} 

