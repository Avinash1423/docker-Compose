# Demo Full-Stack App (React + Spring Boot)

This is a demo full-stack application with a **React (Vite) frontend** and a **Spring Boot backend**.  
The frontend sends **GET requests** to the backend, and the backend responds with results.  

This project demonstrates:  
- **Containerization** with Docker  
- **Automation** with GitHub Actions CI/CD  
- **Hosting** on an AWS EC2 instance with HTTPS via **Nginx** and **Certbot**  

---

## Features

- **React (Vite) frontend** and **Spring Boot backend**  
- **Dockerized** frontend and backend with individual Dockerfiles  
- **Docker Compose** setup to run both frontend and backend together  
- **CI pipeline** to automatically build frontend, backend, and Docker images on every push to the main branch  
- Hosted on an **AWS EC2 Ubuntu instance**  
- **Nginx reverse proxy** for HTTP (port 80) and HTTPS (port 443)  
- **SSL certificate** managed via **Certbot**  
- **Domain name routing** via **DuckDNS**  
- **CD pipeline** to automate deployment to the EC2 instance whenever code changes  

---

## Live Demo

Access the running application here: [https://avinash-ec2-instance.duckdns.org/](https://avinash-ec2-instance.duckdns.org/)
