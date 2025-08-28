select distinct project_id, round(avg(experience_years),2) as average_years from Employee e join Project p on e.employee_id = p.employee_id group by (project_id)
