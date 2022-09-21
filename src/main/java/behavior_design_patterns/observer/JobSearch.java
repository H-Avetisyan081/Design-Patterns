package behavior_design_patterns.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("Middle java developer position");
        jobSite.addVacancy("Java junior position");


        Observer firstSubscriber = new Subscriber("Hovhannes Avetisyan");
        Observer secondSubscriber = new Subscriber("Hayk Avetisyan");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Angular developer position");

        jobSite.removeVacancy("Java junior position");

    }
}
