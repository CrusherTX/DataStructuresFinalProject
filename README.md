# DataStructuresFinalProject
Final Project for Data Structures
Build a triage system that registers patients, queues them for treatment by severity and arrival time, and logs completed cases. You will practice:
  PriorityQueue with a custom comparator for stable triage ordering,
  HashMap for O(1)-ish lookup by patient ID,
  LinkedList for an append-only treatment log,
  Basic performance measurement and reporting.
Learning Objectives
  Implement a PriorityQueue that is stable among equal severities (FIFO).
  Use HashMap<String, Patient> to store and retrieve patient records.
  Maintain a LinkedList<TreatedCase> as a chronological log.
  Measure enqueue/dequeue performance and discuss algorithmic complexity.
  Write modular Java, validate inputs, and document design choices.
  Functional Requirements
1) Patient Registration
  Create or update patients with: id, name, age, severity (define scale), and arrival timestamp.
  Store in HashMap. Duplicate IDs update the existing record (do not create duplicates).
  Updates to severity do not change queue position unless explicitly re-triaged (state your policy clearly).
2) Triage Queue
  Use PriorityQueue<Patient> ordered by:
  Higher severity first.
  Arrival order for ties (FIFO stability).
  APIs to implement:
    enqueueForTriage(id)
    peekNext()
    dequeueNext()
    size() and a non-destructive snapshotOrder()
3) Treatment Flow
  Admit next patient (dequeue), simulate treatment start/end, capture outcome and notes.
  Append a TreatedCase to LinkedList (append-only).
4) Lookup & Reporting
  Find patients by id using HashMap in O(1)-ish time.
  Print triage order without destroying the queue (clone or snapshot).
  Print treatment log (choose oldest→newest or newest→oldest; be consistent).
5) Persistence (lightweight)
  Load seed data from CSV (format below).
  Optional: export the treatment log to CSV.
6) Performance Analysis
  Run workloads (e.g., 100, 1,000, 10,000 enqueues + K dequeues).
  Measure total time for operations (use System.nanoTime()).
  Compare observations to expected complexity (e.g., O(log n) for heap ops).
7) CLI Menu (Text Only)
  Simple, robust text menu. No GUI.
  Gracefully handle invalid inputs; never crash.
Constraints
  Use the standard Java library only (no external dependencies).
  Keep classes small, single-responsibility, and well-documented.
Data Formats
  patients.csv
  id,name,age,severity
    P001,Ana Ruiz,37,4
    P002,James Park,72,5
exported_log.csv (optional)
  id,name,age,initialSeverity,arrivalIso,treatStartIso,treatEndIso,outcome,notes
Deliverables
  Source Code — all .java files under src/edu/hcu/triage/
  README.pdf — how to build/run, design decisions, invariants, known issues, team roles
  PerformanceReport.pdf — methods, tables/plots, analysis vs. theory
  ConsoleOutput.txt — deterministic sample run(s) proving behavior
  slides.pptx — presentation for oral defense (see rubric)
  patients.csv — seed data
  (Optional) treatment_log.csv — exported log
