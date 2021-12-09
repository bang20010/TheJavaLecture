package _2_ByteCode;

public class Moim
    {
        int maxNumberOfAttenees;

        int numbetOfEnrollment;

        public boolean isEnrollmentFull()
            {
                if(maxNumberOfAttenees == 0)
                    {
                        return false;
                    }
                if (numbetOfEnrollment<maxNumberOfAttenees)
                    {
                        return false;
                    }
                return true;
            }
    }
