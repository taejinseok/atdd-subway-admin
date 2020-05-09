package wooteco.subway.admin.dto;

import static java.util.stream.Collectors.*;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import wooteco.subway.admin.domain.Line;
import wooteco.subway.admin.domain.Station;

public class LineResponse {
	private Long id;
	private String name;
	private LocalTime startTime;
	private LocalTime endTime;
	private int intervalTime;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	private String bgColor;

	private Set<Station> stations;

	public LineResponse() {
	}

	public LineResponse(Long id, String name, LocalTime startTime, LocalTime endTime, int intervalTime,
		LocalDateTime createdAt, LocalDateTime updatedAt, String bgColor, Set<Station> stations) {
		this.id = id;
		this.name = name;
		this.startTime = startTime;
		this.endTime = endTime;
		this.intervalTime = intervalTime;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.bgColor = bgColor;
		this.stations = stations;
	}

	public static LineResponse of(Line line) {
		return of(line, new HashSet<>());
	}

	public static LineResponse of(Line line, Set<Station> stations) {
		return new LineResponse(line.getId(), line.getName(), line.getStartTime(), line.getEndTime(),
			line.getIntervalTime(), line.getCreatedAt(), line.getUpdatedAt(), line.getBgColor() ,stations);
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public int getIntervalTime() {
		return intervalTime;
	}

	public Set<Station> getStations() {
		return stations;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public String getBgColor() {
		return bgColor;
	}
}
