package edu.hcu.triage;

import java.time.Instant;
import java.util.Objects;

/**
 * Immutable identity (id) + mutable clinical state (severity).
 * Arrival order must be trackable for FIFO tie-breaking.
 */
public class Patient {
    private final String id;        // e.g., "P001"
    private String name;
    private int age;
    private int severity;           // define scale: higher = more urgent
    private final Instant arrival;  // registration time
    private final long arrivalSeq;  // monotonic sequence for FIFO ties

    // TODO: constructor(s) with validation (null/empty id, bounds for age/severity)
    // TODO: getters for all fields
    // TODO: setters only where allowed (e.g., name, age, severity)
    // TODO: equals/hashCode based on id only (document this in README.pdf)
    // TODO: toString() concise
}
