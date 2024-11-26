package nextstep.ladder.domain.line.point;

import nextstep.ladder.domain.line.LineGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Points {
    private final List<Point> points;

    public Points(List<Point> points) {
        this.points = points;
    }

    public static Points of(int count, LineGenerator lineGenerator) {
        List<Point> points = new ArrayList<>();
        Point currentPoint = Point.first(lineGenerator.draw());
        points.add(currentPoint);

        for (int i = 1; i < count; i++) {
            currentPoint = currentPoint.next(lineGenerator.draw());
            points.add(currentPoint);
        }

        return new Points(points);
    }

    public List<Point> getPoints() {
        return Collections.unmodifiableList(points);
    }

}