
package UI;

import Model.Analytic;
import Model.Encounter;
import Model.MedSystem;
import Model.Patient;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.HashSet;
import Model.Person;
import java.util.ArrayList;
import java.util.Set;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ankitjagtap
 */
public class Analytics extends javax.swing.JPanel {

    /**
     * Creates new form Analytics
     */
    HashMap<String, Integer> ageGroup;
//
//    HashMap<String, ArrayList<Integer>> set;
    MedSystem ms;
//    Analytic an;
//    
//    Set<String> comm;
    ArrayList<Analytic> ana;

    public Analytics(MedSystem ms) {
        initComponents();
        this.ms = ms;
//        set = new HashMap<>();
//        an = new Analytic();
//        comm = new Set<>();

        ArrayList<Integer> ress;
        ana = new ArrayList<>();

        for (Patient pat : ms.getPatientList().getPatients()) {
            for (Encounter enc : pat.getEncounterHistory().getEncounterHistory()) {
                int bp = enc.getVitalSign().getBloodPressure();
                Period period = Period.between(pat.getDob().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), LocalDate.now());
                System.out.println("sdf " + isAbnormal(period.getYears(), bp));

                int age = period.getYears();
                int index = isInArray(pat.getResidence().getState().toString());
                if (age < 21) {
                    if (!isAbnormal(period.getYears(), bp)) {
                        if (index < 0) {
                            Analytic analytic = new Analytic(pat.getResidence().getState(), 0);
                            ana.add(analytic);
                        } else {
                            int res = ana.get(index).arr[0];
                            ana.get(index).addAgeAnalytics(0, ++res);
                        }
//                        if (set.containsKey(pat.getResidence().getState())) {
//                            res = set.get(pat.getResidence().getState());
//                            Integer ii = set.get(pat.getResidence().getState()).get(0);
//                            res.add(0, ++ii);
//                            set.put(pat.getResidence().getState(), res);
//                        } else {
//                             res = new ArrayList<>();
//                            res.add(0,1);
//
//                            set.put(pat.getResidence().getState(), res);
//                        }

                    }

                } else if (age < 46) {
                    if (!isAbnormal(period.getYears(), bp)) {
                        if (index < 0) {
                            Analytic analytic = new Analytic(pat.getResidence().getState(), 1);
                            ana.add(analytic);
                        } else {
                            int res = ana.get(index).arr[1];
                            ana.get(index).addAgeAnalytics(1, ++res);
                        }
//                        if (set.containsKey(pat.getResidence().getState())) {
//                             res = set.get(pat.getResidence().getState());
//                            Integer ii = set.get(pat.getResidence().getState()).get(0);
//                            res.add(1, ++ii);
//                            set.put(pat.getResidence().getState(), res);
//                        } else {
//                             res = new ArrayList<>();
//                            res.add(1,1);
//
//                            set.put(pat.getResidence().getState(), res);
//                        }

                    }

                } else if (age < 65) {
                    if (!isAbnormal(period.getYears(), bp)) {

                        if (index < 0) {
                            Analytic analytic = new Analytic(pat.getResidence().getState(), 2);
                            ana.add(analytic);
                        } else {
                            int res = ana.get(index).arr[2];
                            ana.get(index).addAgeAnalytics(2, ++res);
                        }
//                        if (set.containsKey(pat.getResidence().getState())) {
//                            res = set.get(pat.getResidence().getState());
//                            Integer ii = set.get(pat.getResidence().getState()).get(0);
//                            res.add(2, ++ii);
//                            set.put(pat.getResidence().getState(), res);
//                        } else {
//                            res = new ArrayList<>();
//                            res.add(2,1);
//
//                            set.put(pat.getResidence().getState(), res);
//                        }

                    }
                } else {
                    if (!isAbnormal(period.getYears(), bp)) {

                        if (index < 0) {
                            Analytic analytic = new Analytic(pat.getResidence().getState(), 3);
                            ana.add(analytic);
                        } else {
                            int res = ana.get(index).arr[3];
                            ana.get(index).addAgeAnalytics(3, ++res);
                        }
//                        if (set.containsKey(pat.getResidence().getState())) {
//                             res = set.get(pat.getResidence().getState());
//                            Integer ii = set.get(pat.getResidence().getState()).get(0);
//                            res.add(3, ++ii);
//                            set.put(pat.getResidence().getState(), res);
//                        } else {
//                             res = new ArrayList<>();
//                            res.add(3,1);
//
//                            set.put(pat.getResidence().getState(), res);
//                        }

                    }
                }
            }
        }
        displayPatient();

    }

    public int isInArray(String comm) {
        int i = 0;
        for (Analytic anc : ana) {

            if (anc.getCommunity().equals(comm)) {
                return i;
            }

            i++;
        }
        return -1;
    }

    public boolean isAbnormal(int age, int val) {
        System.out.println("jkdsf" + age + " " + val);

        if (age < 21) {
            if (val >= 109 && val <= 121) {
                return true;
            } else {
                return false;
            }
        } else if (age < 46) {
            if (val >= 115 && val <= 125) {
                return true;
            } else {
                return false;
            }
        } else if (age < 65) {
            if (val >= 118 && val <= 129) {
                return true;
            } else {
                return false;
            }
        } else {
            if (val >= 130 && val <= 143) {
                return true;
            } else {
                return false;
            }
        }

    }

    private void displayPatient() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        int i = 0;
        for (Object key : ana.toArray()) {

            Object[] row = new Object[5];
            row[0] = ana.get(i).Community;
            row[1] = ana.get(i).arr[0];
            row[2] = ana.get(i).arr[1];
            row[3] = ana.get(i).arr[2];
            row[4] = ana.get(i).arr[3];
//            row[1] = set.get(key).get(0);
//            row[2] = set.get(key).get(1);
//            row[3] = set.get(key).get(2);
//            row[4] = set.get(key).get(3);

            i++;
            model.addRow(row);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Community", "Below 21", "21-46", "46-65", "65+"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Abnormal Blood Pressure Statistics");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel1)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(508, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
