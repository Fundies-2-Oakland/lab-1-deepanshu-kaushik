public class Vector3D {

    //Step 1
    double x, y, z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //Step 2
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    //Step 3
    public String toString() {
        String myStr = "%f %f %f";
        String result = String.format(myStr, x, y, z);
        return result;
    }

    //Step 4
    public double getMagnitude() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    //Step 5
    public Vector3D normalize() {
        if (getMagnitude() == 0) {
            throw new IllegalStateException("Magnitude is less than 0");
        }
        else {
            return new Vector3D(x/getMagnitude(), y/getMagnitude(), z/getMagnitude());
        }
    }
    //Citation for IllegalStateException:https://stackoverflow.com/questions/12698275/whats-the-intended-use-of-illegalstateexception

    //Step 6
    public Vector3D add(Vector3D vector) {
        return new Vector3D(x + vector.getX(), y + vector.getY(), z + vector.getZ());
    }

    //Step 7
    public Vector3D multiply(double constant) {
        return new Vector3D(x*constant, y*constant, z*constant);
    }

    //Step 8
    public double dotProduct(Vector3D vector) {
        return x*vector.getX() + y*vector.getY() + z*vector.getZ();
    }

}
