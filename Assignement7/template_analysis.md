# GitHub Project Templates and Kanban Board Implementation

## 1️⃣ Template Analysis and Selection

### Comparison of GitHub Project Templates

| **Template** | **Columns & Workflow** | **Automation Features** | **Suitability for Agile** |
|-------------|----------------------|-----------------|------------------|
| **Basic Kanban** | To Do, In Progress, Done | Manual updates only | Suitable for simple task tracking, but lacks automation for Agile workflows. |
| **Automated Kanban** | Backlog, To Do, In Progress, In Review, Done | Auto-moves issues when PRs are merged, closes completed issues | Ideal for Agile development, as it streamlines workflow and reduces manual updates. |
| **Bug Triage** | New, Under Investigation, In Progress, Fixed, Closed | Auto-labels issues as they are moved | Best for issue tracking and bug resolution but not comprehensive for full Agile development. |

### Justification for Template Choice
We chose **Automated Kanban** because:
- It supports **sprint tracking** with built-in automation.
- It reduces manual updates by **auto-moving issues** based on pull request activity.
- It aligns with Agile workflows by maintaining a **clear backlog and workflow visualization**.

---
## 2️⃣ Custom Kanban Board Creation

### Board Customization
**Additional Columns:**
- **Testing** → To ensure QA before moving tasks to Done.
- **Blocked** → To identify tasks that need dependencies resolved.

### Steps Taken:
1. **Created a GitHub Project using Automated Kanban**.
2. **Added ‘Testing’ and ‘Blocked’ columns** to align with our sprint workflow.
3. **Populated the board** with tasks from the Sprint Plan.
4. **Linked GitHub Issues** (user stories) to the board with appropriate labels (`feature`, `bug`, etc.).
5. **Assigned tasks to team members** using `@mentions`.

📌 *A screenshot of the Kanban board is attached in the project repository.*

---
  🔙 [Back to Main Menu](./MenuForAssignment7.md)
