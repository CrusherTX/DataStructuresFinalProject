package edu.hcu.triage;

import java.nio.file.Path;
import java.util.*;

/** Text-based UI (no GUI). Keep robust and simple. */
public class HospitalApp {

    private final PatientRegistry registry = new PatientRegistry();
    private final TriageQueue triage = new TriageQueue();
    private final TreatmentLog log = new TreatmentLog();
    private final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        new HospitalApp().run(args);
    }

    private void run(String[] args) {
        // TODO: if args.length > 0, attempt to load patients.csv
        // TODO: main loop with menu and input validation
        // Required actions:
        //  1) Register patient
        //  2) Update patient
        //  3) Enqueue for triage (by id)
        //  4) Peek next
        //  5) Admit/treat next (capture outcome + notes; append to log)
        //  6) Show triage order (non-destructive)
        //  7) Find patient by id
        //  8) Show treatment log
        //  9) Performance demo (use SampleWorkloads)
        // 10) Export log to CSV
        //  0) Exit
    }

    // TODO: helper methods for each menu action
}
