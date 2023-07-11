package model;

import java.util.Objects;

public class City {
  private String name;
  private String region;
  private String district;
  private int population;
  private String foundation;

  public City(String name, String region, String district, int population, String foundation) {
    this.name = name;
    this.region = region;
    this.district = district;
    this.population = population;
    this.foundation = foundation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    City city = (City) o;

    if (population != city.population) return false;
    if (foundation != city.foundation) return false;
    if (!Objects.equals(name, city.name)) return false;
    if (!Objects.equals(region, city.region)) return false;
    return Objects.equals(district, city.district);
  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + (region != null ? region.hashCode() : 0);
    result = 31 * result + (district != null ? district.hashCode() : 0);
    result = 31 * result + (foundation != null ? foundation.hashCode() : 0);
    result = 31 * result + population;
    return result;
  }

  @Override
  public String toString() {
    return "City{"
        + "name='"
        + name
        + '\''
        + ", region='"
        + region
        + '\''
        + ", district='"
        + district
        + '\''
        + ", population="
        + population
        + ", foundation="
        + foundation
        + '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  public int getPopulation() {
    return population;
  }

  public void setPopulation(int population) {
    this.population = population;
  }

  public String getFoundation() {
    return foundation;
  }

  public void setFoundation(String foundation) {
    this.foundation = foundation;
  }
}
