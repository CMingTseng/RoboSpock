package pl.polidea.robospock.tasks;

public class ProductionTaskExecutor implements TaskExecutorInterface {
    @Override
    public void execute(final MyRoboAsycTask task) {
        task.execute();
    }

}
