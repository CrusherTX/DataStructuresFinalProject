package edu.hcu.triage;

import java.util.Comparator;

/** Comparator: higher severity first; break ties by smaller arrivalSeq (FIFO). */
public final class TriageOrder implements Comparator<Patient> {
    // TODO: implement compare(...) carefully; do not reverse tie order
    // TODO: document how this yields stable behavior for equal severity
}
