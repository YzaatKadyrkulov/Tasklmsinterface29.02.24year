package peaksoft;

import java.time.LocalDate;

public abstract class EducationCenter   {
      private String name;
      private String LocatedCountry;
      private LocalDate FoundationYear;

      public EducationCenter(String name, String locatedCountry, LocalDate foundationYear) {
            this.name = name;
            LocatedCountry = locatedCountry;
            FoundationYear = foundationYear;
      }

      public String getName() {
            return name;
      }

      public String getLocatedCountry() {
            return LocatedCountry;
      }

      public LocalDate getFoundationYear() {
            return FoundationYear;
      }

      @Override
      public String toString() {
            return "peaksoft.EducationCenter{" +
                    "name='" + name + '\'' +
                    ", LocatedCountry='" + LocatedCountry + '\'' +
                    ", FoundationYear=" + FoundationYear +
                    '}';
      }
}
