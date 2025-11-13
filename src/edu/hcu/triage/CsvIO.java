package edu.hcu.triage;

import java.io.*;
import java.nio.file.*;
import java.util.*;

/** Minimal CSV import/export using standard IO. */
public final class CsvIO {
    // TODO: loadPatients(Path csv, PatientRegistry reg)
    //   - Expect header: id,name,age,severity
    //   - Trim fields; skip blanks; validate; warn on malformed lines with line numbers
    // TODO: exportLog(Path csv, List<TreatedCase> cases)
    //   - Write ISO-8601 times; escape commas in notes if needed
}
}
