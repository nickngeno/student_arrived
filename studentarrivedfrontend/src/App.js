import "./App.css";
import {
  Typography,
  Card,
  CardActions,
  CardContent,
  CardMedia,
  CssBaseline,
  Grid,
  AppBar,
  Toolbar,
  Container,
  Button,
} from "@mui/material";
import { PhotoCamera } from "@mui/icons-material";

function App() {
  return (
    <>
      <CssBaseline />
      <AppBar position="relative">
        <Toolbar>
          <PhotoCamera />
          <Typography variant="h6">hellow you guy!</Typography>
        </Toolbar>
      </AppBar>
      <main>
        <div>
          <Container maxWidth="sm">
            <Typography variant="h5" align="center" color="textSecondary" paragraph>
              This is a long text that i am testing to understad the typography component of material ui.so far i am loving the framework
            </Typography>
          </Container>
          <div>
            <Grid container spacing={2}  justifyItems={"center"} justifyContent={"center"}>
              <Grid item>
                <Button variant="contained">Button one contained </Button>
              </Grid>
              <Grid item>
                <Button variant="outlined">Button 2 contained </Button>
              </Grid>
            </Grid>
          </div>

        </div>
      </main>
    </>
  );
}

export default App;
