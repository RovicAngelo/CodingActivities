package ph.edu.sorsu.dao.impl;

import java.util.ArrayList;
import java.util.List;
import ph.edu.sorsu.dao.ScheduleDAO;
import ph.edu.sorsu.entity.Schedule;

public class ScheduleDAOImpl implements ScheduleDAO<Schedule> {
    private List<Schedule> listOfSchedules = new ArrayList<>();

    @Override
    public void create(Schedule entity) {
        boolean isAdded = listOfSchedules.add(entity);

        if (isAdded) {
            System.out.println("[INFO] You have successfully added a new schedule.");
        } else {
            System.out.println("[ERROR] You have NOT successfully added a new schedule.");
        }
    }

    @Override
    public Schedule read(int indexPosition) {
        System.out.println("[INFO] Retrieving schedule record from  the list...");
        return listOfSchedules.get(indexPosition);
    }

    @Override
    public void update(int indexPosition, Schedule entity) {
        listOfSchedules.remove(indexPosition);
        listOfSchedules.add(indexPosition, entity);
        System.out.println("[INFO] Updating the schedule record in the list...");
        System.out.println("[INFO] You have successfully updated the schedule.");

    }

    @Override
    public void delete(int indexPosition) {
        listOfSchedules.remove(indexPosition);
        System.out.println("[INFO] You have successfully removed a schedule.");
    }

    @Override
    public List<Schedule> readAll() {
        System.out.println("[INFO] Retrieving the list of schedules...");
        System.out.println("[INFO] " + listOfSchedules.size() + " schedule(s) found in your list");
        return listOfSchedules;
    }

}