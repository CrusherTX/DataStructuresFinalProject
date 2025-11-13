package edu.hcu.triage;

import java.util.*;

/** Thin wrapper around PriorityQueue to enforce triage policy and utilities. */
public class TriageQueue {
    private final PriorityQueue<Patient> pq = new PriorityQueue<>(new TriageOrder());

    // TODO: enqueue(Patient p)
    // TODO: enqueueById(PatientRegistry reg, String id) - lookup then enqueue
    // TODO: peekNext(): Optional<Patient>
    // TODO: dequeueNext(): Optional<Patient>
    // TODO: size()
    // TODO: snapshotOrder(): List<Patient> in triage order without mutating the queue
    //       Hint: clone PQ or copy to an array then sort with same comparator.
    // TODO: clear()
}
