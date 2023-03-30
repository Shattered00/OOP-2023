package ie.tudublin;

import java.util.ArrayList;

// Define Boid class
class Boid {
  PVector position;
  PVector velocity;
  PVector acceleration;
  float maxForce; // Maximum steering force
  float maxSpeed; // Maximum speed
  
  // Constructor
  Boid(float x, float y) {
    acceleration = new PVector(0, 0);
    velocity = PVector.random2D();
    position = new PVector(x, y);
    maxSpeed = 3;
    maxForce = 0.05;
  }
  
  // Updates position and velocity based on acceleration
  void update() {
    velocity.add(acceleration);
    velocity.limit(maxSpeed);
    position.add(velocity);
    acceleration.mult(0);
  }
  
  // Applies a force to the acceleration vector
  void applyForce(PVector force) {
    acceleration.add(force);
  }
  
  // Calculates steering force towards a target
  PVector seek(PVector target) {
    PVector desired = PVector.sub(target, position);
    desired.setMag(maxSpeed);
    PVector steer = PVector.sub(desired, velocity);
    steer.limit(maxForce);
    return steer;
  }
  
  // Calculates the average velocity of nearby boids
  PVector align(ArrayList<Boid> boids) {
    float perceptionRadius = 50;
    PVector sum = new PVector(0, 0);
    int count = 0;
    for (Boid other : boids) {
      float d = PVector.dist(position, other.position);
      if (d < perceptionRadius && other != this) {
        sum.add(other.velocity);
        count++;
      }
    }
    if (count > 0) {
      sum.div(count);
      sum.setMag(maxSpeed);
      PVector steer = PVector.sub(sum, velocity);
      steer.limit(maxForce);
      return steer;
    } else {
      return new PVector(0, 0);
    }
  }
  
  // Calculates the average position of nearby boids
  PVector cohesion(ArrayList<Boid> boids) {
    float perceptionRadius = 50;
    PVector sum = new PVector(0, 0);
    int count = 0;
    for (Boid other : boids) {
      float d = PVector.dist(position, other.position);
      if (d < perceptionRadius && other != this) {
        sum.add(other.position);
        count++;
      }
    }
    if (count > 0) {
      sum.div(count);
      return seek(sum);
    } else {
      return new PVector(0, 0);
    }
  }
  
  // Calculates the separation force from nearby boids
  PVector separate(ArrayList<Boid> boids) {
    float perceptionRadius = 50;
    PVector sum = new PVector(0, 0);
    int count = 0;
    for (Boid other : boids) {
      float d = PVector.dist(position, other.position);
      if (d < perceptionRadius && other != this) {
        PVector diff = PVector.sub(position, other.position);
        diff.div(d*d);
        sum.add(diff);
        count++;
      }
    }
    if (count > 0) {
      sum.div(count);
      sum.setMag(maxSpeed);
      PVector steer = PVector.sub(sum, velocity);
      steer.limit(maxForce);
      return steer;
    } else {
      return new PVector(0, 0);
    }
  }
  
  // Calculates the total steering force based on the three boid behaviors
  void


/*import processing.core.PApplet;
import processing.core.PVector;
import java.util.ArrayList;


public class Boid extends PApplet
{
  PVector location;
  PVector velocity;
  PVector acceleration;

  static float boidHeight = 12.0f;
  static float boidWidth = 0f;
  public Boid()
  {
    location = new PVector(random(width),random(height));
    velocity = new PVector(random(-2.5f,2.5f),random(-2.5f,2.5f));
    acceleration = new PVector();
  }

  public void render()
  {
    pushMatrix();
    translate(location.x,location.y);
    rotate(-(float)atan2(-velocity.y,velocity.x));
    triangle(-boidHeight/2.0f, boidWidth/2.0f, -boidHeight/2.0f, 0 , -boidHeight/2.0f,-boidWidth/2.0f);
    popMatrix();
  }
  public ArrayList boids;

  public void setup()
  {
    boids = new ArrayList(); 

    for(int i = 0; i <200; i++)
    {
      Boid b = new Boid();
      boids.add(b);
    }
  }
    
    public void draw()
    {
      for (int i = 0; i < boids.size(); i++)
      {
        Boid b = (Boid)boids.get(i);
        b.render();
      }
    }
  }
*/